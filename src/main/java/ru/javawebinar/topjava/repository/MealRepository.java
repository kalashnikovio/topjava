package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;

import java.util.Collection;

public interface MealRepository {
    Meal get(int id);

    boolean delete(int id);

    Meal save(Meal meal);

    Collection<Meal> getAll();
}
