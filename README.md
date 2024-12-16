## The green arrow and the command line behave differently

clone this repository and run the following command:

```bash
 ./gradlew test
```
you can see:

```
> Task :test
beforeSuite 
beforeSuite 
beforeSuite 
beforeTest 

MyTest > a() STANDARD_OUT
    a
 afterTest  
beforeTest 

MyTest > b() STANDARD_OUT
    b
 afterTest  
beforeTest 

MyTest > c() STANDARD_OUT
    c
 afterTest  
afterSuite 
afterSuite 
afterSuite 
```

Click on the green arrow to perform results different from what you expect


![71734343700_.pic.jpg](71734343700_.pic.jpg)

Test case details are mistakenly printed during the `testClasses` task instead of the `test` task


So My Hook function is error
