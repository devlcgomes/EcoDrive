package devandroid.gomes.ecodrive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import devandroid.gomes.ecodrive.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Instanciando o binding com o inflate
        binding = ActivityMainBinding.inflate(layoutInflater)
        // Agora eu seto o meu contentLayout como root
        setContentView(binding.root)

        // Atribuindo um evento de click ao botão de calcular
        binding.buttonCalculate.setOnClickListener {
            calculate()
        }
    }

    // Função para validar os dados.
    private fun isValidFields(): Boolean {
        // Caso os 3 campos estiverem preenchidos, retorne true.
        return (
                binding.editTextDistance.text.toString() != "" &&
                binding.editTextPrice.text.toString() != "" &&
                binding.editTextAutonomy.text.toString() != "" &&
                binding.editTextAutonomy.text.toString()  .toFloat() != 0f
                )
    }

    private fun calculate() {

        // Se a função validadora retornar true, dê seguimento.
        if(isValidFields()) {
            val distance = binding.editTextDistance.text.toString().toFloat()
            val price = binding.editTextPrice.text.toString().toFloat()
            val autonomy = binding.editTextAutonomy.text.toString().toFloat()

            val totalValue = (distance * price) / autonomy

            // Atribuindo o valor novo para o texto do valor total
            binding.textFieldTotalExpense.text = "R$ ${"%.2f".format(totalValue)}"
        } else {
            // Toast de aviso para preencher todos os campos
            Toast.makeText(this, R.string.warningText, Toast.LENGTH_SHORT).show()
        }




    }
}