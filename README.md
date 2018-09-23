# java-spark-build-API

Building an API with Spark framework of Java

Local test:

"GET" - getting resources  
[GET]  
http://localhost:4567/courses -> return all courses  
[GET]  
http://localhost:4567/courses/1 -> return a single course with Id 1  


"POST" - creating new resources  
content accepted in the body request: JSON  
[POST]  
http://localhost:4567/courses  
{
  "name" : "test",
  "url" : "http://test.com"
}
-> create a new course with auto-incremented Id  
[POST]  
http://localhost:4567/courses/1/reviews   
{
  "rating" : 5,
  "comment" : "Amazing course"
}
-> create a review for course 1  
