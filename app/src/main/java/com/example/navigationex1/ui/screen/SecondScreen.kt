@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class
)

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigationex1.ui.theme.NavigationEx1Theme

@Composable
fun SecondScreen(
    navigateForward: () -> Unit,
    navigateUp: () -> Unit
) {
    Scaffold(
        topBar = { MyTopBar(navigateUp) },
        floatingActionButton = { MyFab(navigateForward) }
    ) { innerPadding ->
        Box(
            modifier = Modifier.padding(innerPadding))

    }
}

@Composable
fun MyFab(navigateForward: () -> Unit) {
    TODO("Not yet implemented")
}

@Composable
fun MyTopBar(navigateUp: () -> Unit) {
    TopAppBar(title = {
        Text(text = "Second Screen", style = MaterialTheme.typography.displaySmall)
    }, navigationIcon = {
                        IconButton(onClick = navigateUp) {
                            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                        }
    },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.tertiary
        )
    )
}


//@Preview
//@Composable
//fun MyFab(navigateForward: () -> Unit) {
//    FloatingActionButton(onClick = navigateForward) {
//        Icon(imageVector = Icons.Default.Add, contentDescription = null)
//
//    }
//}

@Preview
@Composable
fun MyFabPreview(){
    NavigationEx1Theme {
        MyTopBar(navigateUp = {})
    }
}

@Preview
@Composable
fun MyTopBarPreview(){
    NavigationEx1Theme {
        MyTopBar(navigateUp = {})
    }
}

@Preview
@Composable
fun SecondScreenPreview(){
    NavigationEx1Theme {
       SecondScreen(navigateForward = { /*TODO*/ },
           navigateUp = {})

       }
    }
