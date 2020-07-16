# Zwift_Automation_Project

 steps:
 
 1.Clone the project
 
 2.Open Intellij -> go to file-> new->project from version control->Repository URL https://github.com/MinchoRusev/Zwift_Automation_Project.git
 
 3.Setup JDK->12
 
 4.Open your Chrome browser -> enter chrome://version/ -> copy chrome version.
 
 5.Go to src/test/java/commons/Library and paste the chrome version to line 23 ( WebDriverManager.chromedriver().version("84.0.4147.89").setup());
 
 6.Go to src/test/java/testSuit folder->Open ZwiftSmokeTest class
 
 7.Run the tests
