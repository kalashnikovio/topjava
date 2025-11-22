package ru.javawebinar.topjava.Memory;

import ru.javawebinar.topjava.model.Meal;

import java.util.Collection;

public interface MealMemory {
    Meal get(int id);

    boolean delete(int id);

    Meal save(Meal meal);

    Collection<Meal> getAll();
}
