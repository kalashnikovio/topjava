### Get all users
curl -X GET --location "http://localhost:8080/topjava/rest/admin/users/" \

### Get user 100001
curl -X GET --location "http://localhost:8080/topjava/rest/admin/users/100001" \

### Get all meals
curl -X GET --location "http://localhost:8080/topjava/rest/profile/meals" \

### Get meal 100004
curl -X GET --location "http://localhost:8080/topjava/rest/profile/meals/100004" \

### Get between meals
curl -X GET --location "http://localhost:8080/topjava/rest/profile/meals//between?startDate=2020-01-30&startTime=07%3A00&endDate=2020-01-31&endTime=11%3A00" \

### Delete meal 100003
curl -X DELETE --location "http://localhost:8080/topjava/rest/profile/meals/100003" \

### Create meal
curl -X POST --location "http://localhost:8080/topjava/rest/profile/meals" \
-H "Content-Type: application/json;charset=UTF-8" \
-d '{"dateTime": "2020-02-01T12:00","description": "Создан обед","calories": 300 }'

### Update meal 100003
curl -X PUT --location "http://localhost:8080/topjava/rest/profile/meals/100003" \
-H "Content-Type: application/json;charset=UTF-8" \
-d '{"dateTime": "2021-02-01T12:00","description": "Обновить еду","calories": 300 }'



