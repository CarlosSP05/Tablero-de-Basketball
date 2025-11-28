package com.example.tablero_basket_;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tablero_basket_.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private int localScore = 0;
    private int visitorScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Data Binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Botones LOCAL
        binding.btnLocalPlus1.setOnClickListener(v -> updateLocal(1));
        binding.btnLocalPlus2.setOnClickListener(v -> updateLocal(2));
        binding.btnLocalMinus1.setOnClickListener(v -> updateLocal(-1));

        // Botones VISITANTE
        binding.btnVisitorPlus1.setOnClickListener(v -> updateVisitor(1));
        binding.btnVisitorPlus2.setOnClickListener(v -> updateVisitor(2));
        binding.btnVisitorMinus1.setOnClickListener(v -> updateVisitor(-1));

        // Reset
        binding.btnReset.setOnClickListener(v -> resetScores());

        // Pasar a ScoreActivity
        binding.btnShowResult.setOnClickListener(v -> openScoreActivity());
    }

    private void updateLocal(int delta) {
        localScore = Math.max(0, localScore + delta);
        binding.tvLocalScore.setText(String.valueOf(localScore));
    }

    private void updateVisitor(int delta) {
        visitorScore = Math.max(0, visitorScore + delta);
        binding.tvVisitorScore.setText(String.valueOf(visitorScore));
    }

    private void resetScores() {
        localScore = 0;
        visitorScore = 0;
        binding.tvLocalScore.setText("0");
        binding.tvVisitorScore.setText("0");
    }

    private void openScoreActivity() {
        Intent intent = new Intent(this, ScoreActivity.class);
        intent.putExtra("localScore", localScore);
        intent.putExtra("visitorScore", visitorScore);
        startActivity(intent);
    }
}
