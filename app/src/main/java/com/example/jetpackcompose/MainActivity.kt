package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.fragment.app.Fragment
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import com.example.jetpackcompose.ui.theme.LazyColumn.StickyHeaderWithLazyColumn
import com.example.jetpackcompose.ui.theme.LimitedTextField.LimitedTextField
import com.example.jetpackcompose.ui.theme.color2
import com.example.jetpackcompose.ui.theme.color3
import com.example.jetpackcompose.ui.theme.color4
import com.example.jetpackcompose.ui.theme.dependency_injection.MakeupCategory
import com.example.jetpackcompose.ui.theme.dependency_injection.MakeupProduct
import com.example.jetpackcompose.ui.theme.dependency_injection.ProductColor
import com.example.jetpackcompose.ui.theme.dependency_injection.ProductType
import com.example.jetpackcompose.ui.theme.navigation.SetNavGraph
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController : NavHostController

    //Field Injection
    @Inject
    lateinit var lipStick : MakeupProduct

    @Inject
    lateinit var color : ProductColor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    lipStick.makeup()
                    println(color.getColor())

                    //ExpandableCard()
                    //TextSelection()
                    //CallSuperScriptText()
                    // CallSubScriptText()
                    // MyTextField()
                    /* SignUpWithGoogle("Sign Up With Google", "Account Loading...", onClicked = {
                        Log.i("google button", "clicked")
                    }*/
                        //CoilImage()
                    //PasswordComp()


               /*  GradientButton(
                     text = "Welcome",
                     textColor = Color.White,
                     gradient = Brush.horizontalGradient(
                        colors = listOf(
                            color1,
                            color2,
                            color3,
                            color4
                        )
                     )
                 ) {

                 } */

                    /*
                    //navigation için
                    navController = rememberNavController()
                    SetNavGraph(navController = navController)

                    */
                    /*

                    // Burada olayımız tüm bu initilization kısımlarını yapmadan direkt makeup()  ı kullanabilmek

                    val productType = ProductType()
                    val makeupCategory = MakeupCategory()

                    val makeupProduct = MakeupProduct(makeupCategory,productType)

                    makeupProduct.makeup()

                    */



                }

                //CoilImage()

                //LazyColumnComponent()

                //StickyHeaderWithLazyColumn()




            }
        }
    }


    @AndroidEntryPoint
    class MyFragment : Fragment(){

        //burada önemli olan makeup roduct sınıfının hangi yapıda olduğu
        //hem fragmentte çağırılıyor hem de application da o yüzden
        //hiyerarşide üstte olanı seçmemiz lazım

        @Inject
        lateinit var blush : MakeupProduct
    }
}

