import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


enum class Screen{
    First,
    Second,
    Third
}

@Composable
fun Navigation () {
    // step 1: Create a navController object
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.First.name) {


        composable(Screen.First.name,) {FirstScreen(
            navigateToNext = {navController.navigate(Screen.Second.name)} // our task is in curly braces not in parenthesis......explaining the lambda function
        )}
composable(Screen.Second.name,){SecondScreen(navigateForward = { navController.navigate(Screen.Third.name)},
    navigateUp= {navController.navigate(Screen.First.name)} ) }



      composable(Screen.Third.name,) {ThirdScreen(navigateBack = {navController.navigate(Screen.Second.name)})}
    }
}

