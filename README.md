<h1>Problem Statement:</h1>
Please provide some code which allows a user to answer questions for a personality test
(both client and server), based on the data provided. You'll find a JSON file in database/personality_test.json
The answers to the questions should be stored, and should be queryable in the future.
Please provide an list of questions, separated by category. The resulting app should handle
 rotation and scale for tablets as well as phones.

<h1>Approach Selected</h1>
As I was from Android Development my main focus is building an scalable
app for given requirements. I have opted serverless Firebase for this. I have used Firebase store to save the JSON
file and retrieve through retrofit API call rather than SDK kind of things. The link to access the file is
https://firebasestorage.googleapis.com/v0/b/personality-test-8f8f1.appspot.com/o/personality_test.json?alt=media&token=57f7059b-310b-4467-9a14-28426fc0a830

And to store the data that was selected by user from the questionnaire I have used Firebase RealTimeDatabase.
I have opted for creating anonymous user by default and store his selection in the user_info node. Structure would be
![This is an image](https://github.com/pavan5208/android_spark_personality_test/blob/master/references/Screen%20Shot%202021-08-31%20at%2011.44.37%20PM.png)


users_info Table
1.  |--UserIDs collections
2.     |-- Each User Node has the categories list
3.       |-- Each category has the SelectedItem
(like question,option selected, inner question if applicable) selected
![This is an image](https://github.com/pavan5208/android_spark_personality_test/blob/master/references/Screen%20Shot%202021-08-31%20at%2011.44.54%20PM.png)


I have chosen MVVM with clean architecture for this project because it
provides loose coupling of things and testing can also be performed with ease. I have also used Dagger
to demonstrate my knowledge on dependency injection.

As clean architecture Has mainly 3 layers
1. domain
3. data
3. Presentation

Our code is divided into above mentioned packages we can say
1. domain -- Models & RepoInterface will be places
2. data  -- API Service and RepoImpl are places
3. ui   -- Activities, Fragments, ViewModels are placed
4. di  -- Dagger related stuff like  component and modules are placed


Coming to tests part I have implemented  Unit tests with Junit and Mockito, Also written integration or automation tests with
espresso. There are also few other testing dependencies which are added for different purposes.




