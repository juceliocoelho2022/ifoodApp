package com.devjucelio.ifoodapp.list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.devjucelio.ifoodapp.R

@Composable
fun FoodItem(

){

    ConstraintLayout (
       modifier = Modifier
           .fillMaxWidth()
           .background(Color.Black)
           .padding(0.dp, 10.dp, 0.dp, 10.dp)
    ){

      val (
          imgFood,
          txtFoodName,
          txtFoodDescription,
          txtPrice,
          btAddCart,
          containerImg,
          rowItem
      )= createRefs()
        Card(
            modifier = Modifier
                .constrainAs(containerImg){
                  top.linkTo(parent.top, 0.dp)
                    start.linkTo(parent.start, 0.dp)
                }
                .size(130.dp)
                .padding(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            shape = ShapeDefaults.Medium,
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            )
        ) {

        }
        Image(
            painter = painterResource(id = R.drawable.food1),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(imgFood){
                  top.linkTo(containerImg.top,0.dp)
                    start.linkTo(containerImg.start, 0.dp)
                    end.linkTo(containerImg.end,0.dp)
                    bottom.linkTo(containerImg.bottom,0.dp)
                }
                .size(60.dp)
        )
        Text(
            text =  "Food1",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color =  Color.White,
            modifier =  Modifier.constrainAs(txtFoodName){
                top.linkTo(parent.top,30.dp)
                start.linkTo(containerImg.end, 0.dp)

            }
        )
        Text(
            text = "Arroz branco como base.\n" +
                    "Frango à parmegiana, coberto com molho de tomate e uma generosa camada de queijo derretido.\n" +
                    "Brócolis cozido, como acompanhamento vegetal.\n" +
                    "Batata palha, servida em uma porção separada.",
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            color =  Color.White,
            modifier =  Modifier.constrainAs(txtFoodDescription){
                top.linkTo(txtFoodName.bottom)
                start.linkTo(containerImg.end)
                end.linkTo(parent.end)
            }.padding(65.dp, 10.dp, 40.dp, 0.dp),
             maxLines = 4
        )
        Text(
            text =  "R$:25.90",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color =  Color.White,
            modifier =  Modifier.constrainAs(txtPrice){
                top.linkTo(txtFoodDescription.bottom,20.dp)
                start.linkTo(containerImg.end, 0.dp)

            }


        )
    }
}


@Composable
@Preview
private fun FoodItemPreview(){
    FoodItem()
}
