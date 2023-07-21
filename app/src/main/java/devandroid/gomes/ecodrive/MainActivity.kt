package devandroid.gomes.ecodrive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import devandroid.gomes.ecodrive.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Instanciando o binding com o inflate
        binding = ActivityMainBinding.inflate(layoutInflater)
        // Agora eu seto o meu contentLayout como root
        setContentView(binding.root)


    }
}