package com.devjucelio.ifoodapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.devjucelio.ifoodapp.model.Food

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          FoodList()
        }
    }
}

@Composable
private fun FoodList(){
    val foodList: MutableList<Food> = mutableListOf(
        Food(
            imgFood = R.drawable.food1,
            foodName = "Food 1",
            foodDescription = "Arroz branco como base.\n" +
                    "Frango à parmegiana, coberto com molho de tomate e uma generosa camada de queijo derretido.\n" +
                    "Brócolis cozido, como acompanhamento vegetal.\n" +
                    "Batata palha, servida em uma porção separada.",
            price = "R$: 25.90"
        ),
        Food(
            imgFood = R.drawable.food2,
            foodName = "Food 1",
            foodDescription = "",
            price = "R$: 27.30"
        ),
        Food(
            imgFood = R.drawable.food3,
            foodName = "Food 1",
            foodDescription = "Pratos Diversificados",
            price = "R$: 35.90"
        ),
        Food(
            imgFood = R.drawable.food4,
            foodName = "Food 1",
            foodDescription = "Pratos vareados",
            price = "R$: 22.90"
        ),
        Food(
            imgFood = R.drawable.food5,
            foodName = "Food 1",
            foodDescription = "Pratos vareados",
            price = "R$: 19.99"
        ),
    )

    Column (
        modifier = Modifier.fillMaxSize()
            .background(color = Color.Black)
    ){
      LazyColumn(

      ) {

      }
    }
}
