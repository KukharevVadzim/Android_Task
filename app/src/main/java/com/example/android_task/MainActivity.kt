package com.example.android_task

<<<<<<< HEAD
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

const val USER_EMAIL: String = "user_email"
const val USER_PASSWORD: String = "user_password"

=======
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
>>>>>>> 7409c44 (New Commit.)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
<<<<<<< HEAD

        button.setOnClickListener() {
            if (email.text.toString().isEmpty() || password.text.toString().isEmpty()){
                Toast.makeText(this, "Введите свой email и пароль", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra(USER_EMAIL, email.text.toString())
                intent.putExtra(USER_PASSWORD, password.text.toString())
                startActivity(intent)
                fileList()
            }
        }
    }
}

=======
    }
}
>>>>>>> 7409c44 (New Commit.)
=======
    }
}
>>>>>>> 7409c44 (New Commit.)
