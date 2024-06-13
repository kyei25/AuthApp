package com.example.userlogin

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("RememberReturnType")
@Composable
fun SignUpScreen(navigateToLoginScreen: () -> Unit) {
    var togglePasswordVisibility by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24 .dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        var nameText by remember {
            mutableStateOf("")
        }
        var emailText by remember {
            mutableStateOf("")
        }
        var passwordText by remember {
            mutableStateOf("")
        }
        var confirmPassword by remember {
            mutableStateOf("")
        }
        Image(
            painter = painterResource(
                id = R.drawable.vector
            ),
            contentDescription = "image", Modifier.size(250.dp)
        )

        Text(
            text = "Welcome Back!",
            color = Color.Black,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Welcome back! Please enter your details.",
            color = Color.Gray,
            fontSize = 16.sp,
            fontWeight = FontWeight.Light
        )

        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier.width(328.dp),
            value = nameText, onValueChange = {
                nameText = it
            }, label = {
                Text(text = "Name")
            })
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier.width(328.dp),
            value = emailText, onValueChange = {
                emailText = it
            }, label = {
                Text(text = "Email")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier.width(328.dp),
            value = passwordText, onValueChange = {
                passwordText = it
            }, label = {
                Text(text = "password")
            },
            visualTransformation = if (togglePasswordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                IconButton(onClick = { togglePasswordVisibility = !togglePasswordVisibility }) {
                    Icon(
                        painter = if (togglePasswordVisibility) painterResource(id = R.drawable.eye) else painterResource(
                            id = R.drawable.eyeclose2
                        ),
                        modifier = Modifier.size(24.dp),
                        contentDescription = "visibility"
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier.width(328.dp),
            value = confirmPassword, onValueChange = {
                confirmPassword = it
            }, label = {
                Text(text = "Confirm password")
            },
            visualTransformation = if (togglePasswordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                IconButton(onClick = { togglePasswordVisibility = !togglePasswordVisibility }) {
                    Icon(
                        painter = if (togglePasswordVisibility) painterResource(id = R.drawable.eye) else painterResource(
                            id = R.drawable.eyeclose2
                        ),
                        modifier = Modifier.size(24.dp),
                        contentDescription = "visibility"
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            modifier = Modifier
                .width(328.dp)
                .height(55.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            ),
            onClick = { }) {
            Text(
                text = "Login", fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )

        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            modifier = Modifier.clickable {
                 navigateToLoginScreen()
            },
            text = "Already have an account? Login",
            fontSize = 14.sp
        )
    }

}
