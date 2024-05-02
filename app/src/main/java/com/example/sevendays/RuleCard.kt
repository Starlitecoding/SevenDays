package com.example.sevendays

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sevendays.model.Rules
import com.example.sevendays.model.RulesRepository

@Composable
fun RuleCard(modifier: Modifier = Modifier, rule: Rules, position: Int){
    Card(modifier = Modifier.padding(vertical = 16.dp), shape = RectangleShape) {

        Column (modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)){
            Text(text = "Rule ${position + 1}", style = MaterialTheme.typography.bodySmall)

            Text(text = stringResource(id = rule.headLine), style = MaterialTheme.typography.bodyLarge)


            Image(painter = painterResource(id = rule.image),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
            )


            Text(text = stringResource(id = rule.body), style = MaterialTheme.typography.bodySmall)
        }

    }
}



@Preview
@Composable
fun RuleCardPreview(){
    val rule = Rules(
        headLine = R.string.head_1,
        image = R.drawable.img1,
        body = R.string.body_1
    )

}