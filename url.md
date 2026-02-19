### Get all users
curl -X GET --location "http://localhost:8080/topjava/rest/admin/users/" \
-H "Accept: application/json" \
-H "User-Agent: IntelliJ HTTP Client/IntelliJ IDEA 2024.3" \
-H "Accept-Encoding: br, deflate, gzip, x-gzip"

### Get user 100001
curl -X GET --location "http://localhost:8080/topjava/rest/admin/users/100001" \
-H "Accept: application/json" \
-H "User-Agent: IntelliJ HTTP Client/IntelliJ IDEA 2024.3" \
-H "Accept-Encoding: br, deflate, gzip, x-gzip"

### Get all meals
curl -X GET --location "http://localhost:8080/topjava/rest/profile/meals" \
-H "Accept: application/json" \
-H "User-Agent: IntelliJ HTTP Client/IntelliJ IDEA 2024.3" \
-H "Accept-Encoding: br, deflate, gzip, x-gzip"

### Get meal 100004
curl -X GET --location "http://localhost:8080/topjava/rest/profile/meals/100004" \
-H "Accept: application/json" \
-H "User-Agent: IntelliJ HTTP Client/IntelliJ IDEA 2024.3" \
-H "Accept-Encoding: br, deflate, gzip, x-gzip"

### Get between meals
curl -X GET --location "http://localhost:8080/topjava/rest/profile/meals//between?startDate=2020-01-30&startTime=07%3A00&endDate=2020-01-31&endTime=11%3A00" \
-H "Accept: application/json" \
-H "User-Agent: IntelliJ HTTP Client/IntelliJ IDEA 2024.3" \
-H "Accept-Encoding: br, deflate, gzip, x-gzip"

### Delete meal 100003
curl -X DELETE --location "http://localhost:8080/topjava/rest/profile/meals/100003" \
-H "Accept: application/json" \
-H "User-Agent: IntelliJ HTTP Client/IntelliJ IDEA 2024.3" \
-H "Accept-Encoding: br, deflate, gzip, x-gzip"



