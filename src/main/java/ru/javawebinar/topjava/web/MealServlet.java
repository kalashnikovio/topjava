package ru.javawebinar.topjava.web;

import org.slf4j.Logger;
import ru.javawebinar.topjava.Memory.InMealMemory;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.util.MealsUtil;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

import static org.slf4j.LoggerFactory.getLogger;

public class MealServlet extends HttpServlet {
    private static final Logger log = getLogger(MealServlet.class);
    private InMealMemory mealMemory;

    public void init() {
        mealMemory = new InMealMemory();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");

        Meal meal = new Meal(id.isEmpty() ? null : Integer.valueOf(id),
                LocalDateTime.parse(request.getParameter("dateTime")),
                request.getParameter("description"),
                Integer.parseInt(request.getParameter("calories")));

        mealMemory.save(meal);
        response.sendRedirect("meals");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            log.info("all meals");
            request.setAttribute("meals",
                    MealsUtil.getMealTos(mealMemory.getAll(), MealsUtil.DEFAULT_CALORIES_MAXIMUM));
            request.getRequestDispatcher("/meals.jsp").forward(request, response);
        } else {
            switch (action) {
                case "delete":
                    int id = Integer.parseInt(request.getParameter("id"));
                    mealMemory.delete(id);
                    log.info("delete meal");
                    response.sendRedirect("meals");
                    break;
                case "update":
                    log.info("update meal");
                    Meal meal =  mealMemory.get(Integer.parseInt(request.getParameter("id")));
                    request.setAttribute("meal", meal);
                    request.getRequestDispatcher("/mealForm.jsp").forward(request, response);
                    break;
            }
        }

    }
}
