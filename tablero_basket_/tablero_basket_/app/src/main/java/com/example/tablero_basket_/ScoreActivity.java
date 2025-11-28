package com.example.tablero_basket_;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tablero_basket_.databinding.ActivityScoreBinding;

public class ScoreActivity extends AppCompatActivity {

    private ActivityScoreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityScoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int localScore = getIntent().getIntExtra("localScore", 0);
        int visitorScore = getIntent().getIntExtra("visitorScore", 0);

        // Mostrar marcador final
        binding.tvFinalScore.setText(localScore + " - " + visitorScore);

        // Determinar ganador
        if (localScore > visitorScore) {
            binding.tvWinner.setText("Ha ganado el equipo LOCAL");
        } else if (visitorScore > localScore) {
            binding.tvWinner.setText("Ha ganado el equipo VISITANTE");
        } else {
            binding.tvWinner.setText("Empate");
        }
    }
}
