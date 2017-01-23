package leafstudios.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class gameplay extends AppCompatActivity {

    private Button A_button;
    private Button B_button;
    private Button C_button;
    private Button D_button;
    private Button E_button;
    private Button F_button;
    private Button G_button;
    private Button H_button;
    private Button I_button;
    private Button J_button;
    private Button K_button;
    private Button L_button;
    private Button M_button;
    private Button N_button;
    private Button O_button;
    private Button P_button;
    private Button Q_button;
    private Button R_button;
    private Button S_button;
    private Button T_button;
    private Button U_button;
    private Button V_button;
    private Button W_button;
    private Button X_button;
    private Button Y_button;
    private Button Z_button;
    private Button Hint_button;
    private ImageView GallowsView;
    private ArrayList<Letter> word;
    private boolean[] usedChar;
    private int misses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        usedChar = new boolean[26];
        for(int x = 0; x < 26; x++){
            usedChar[x] = false;
        }

        Intent intent = getIntent();
        A_button = (Button) findViewById(R.id.A_button);
        B_button = (Button) findViewById(R.id.B_button);
        C_button = (Button) findViewById(R.id.C_button);
        D_button = (Button) findViewById(R.id.D_button);
        E_button = (Button) findViewById(R.id.E_button);
        F_button = (Button) findViewById(R.id.F_button);
        G_button = (Button) findViewById(R.id.G_button);
        H_button = (Button) findViewById(R.id.H_button);
        I_button = (Button) findViewById(R.id.I_button);
        J_button = (Button) findViewById(R.id.I_button);
        K_button = (Button) findViewById(R.id.J_button);
        L_button = (Button) findViewById(R.id.L_button);
        M_button = (Button) findViewById(R.id.M_button);
        N_button = (Button) findViewById(R.id.N_button);
        O_button = (Button) findViewById(R.id.O_button);
        P_button = (Button) findViewById(R.id.P_button);
        Q_button = (Button) findViewById(R.id.Q_button);
        R_button = (Button) findViewById(R.id.R_button);
        S_button = (Button) findViewById(R.id.S_button);
        T_button = (Button) findViewById(R.id.T_button);
        U_button = (Button) findViewById(R.id.U_button);
        V_button = (Button) findViewById(R.id.V_button);
        W_button = (Button) findViewById(R.id.W_button);
        X_button = (Button) findViewById(R.id.X_button);
        Y_button = (Button) findViewById(R.id.Y_button);
        Z_button = (Button) findViewById(R.id.Z_button);
        Hint_button = (Button) findViewById(R.id.Hint_Button);
        GallowsView = (ImageView) findViewById(R.id.GallowsView);

        Hint_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        A_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[0] = true;
                checkLetter('A');
                A_button.setVisibility(View.GONE);
                A_button.setOnClickListener(null);
            }
        });

        B_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[1] = true;
                checkLetter('B');
                B_button.setVisibility(View.GONE);
                B_button.setOnClickListener(null);
            }
        });

        C_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[2] = true;
                checkLetter('C');
                C_button.setVisibility(View.GONE);
                C_button.setOnClickListener(null);
            }
        });

        D_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[3] = true;
                checkLetter('D');
                D_button.setVisibility(View.GONE);
                D_button.setOnClickListener(null);
            }
        });

        E_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[4] = true;
                checkLetter('E');
                E_button.setVisibility(View.GONE);
                E_button.setOnClickListener(null);
            }
        });

        F_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[5] = true;
                checkLetter('F');
                F_button.setVisibility(View.GONE);
                F_button.setOnClickListener(null);
            }
        });

        G_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[6] = true;
                checkLetter('G');
                G_button.setVisibility(View.GONE);
                G_button.setOnClickListener(null);
            }
        });

        H_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[7] = true;
                checkLetter('H');
                H_button.setVisibility(View.GONE);
                H_button.setOnClickListener(null);
            }
        });

        I_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[8] = true;
                checkLetter('I');
                I_button.setVisibility(View.GONE);
                I_button.setOnClickListener(null);
            }
        });

        J_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[9] = true;
                checkLetter('J');
                J_button.setVisibility(View.GONE);
                J_button.setOnClickListener(null);
            }
        });

        K_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[10] = true;
                checkLetter('K');
                K_button.setVisibility(View.GONE);
                K_button.setOnClickListener(null);
            }

        });

        L_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[11] = true;
                checkLetter('L');
                L_button.setVisibility(View.GONE);
                L_button.setOnClickListener(null);
            }
        });

        M_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[12] = true;
                checkLetter('M');
                M_button.setVisibility(View.GONE);
                M_button.setOnClickListener(null);
            }
        });

        N_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[13] = true;
                checkLetter('N');
                N_button.setVisibility(View.GONE);
                N_button.setOnClickListener(null);
            }
        });

        O_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[14] = true;
                checkLetter('O');
                O_button.setVisibility(View.GONE);
                O_button.setOnClickListener(null);
            }
        });

        P_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[15] = true;
                checkLetter('P');
                P_button.setVisibility(View.GONE);
                P_button.setOnClickListener(null);
            }
        });

        Q_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[16] = true;
                checkLetter('Q');
                Q_button.setVisibility(View.GONE);
                Q_button.setOnClickListener(null);
            }
        });

        R_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[17] = true;
                checkLetter('R');
                R_button.setVisibility(View.GONE);
                R_button.setOnClickListener(null);
            }
        });

        S_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[18] = true;
                checkLetter('S');
                S_button.setVisibility(View.GONE);
                S_button.setOnClickListener(null);
            }
        });

        T_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[19] = true;
                checkLetter('T');
                T_button.setVisibility(View.GONE);
                T_button.setOnClickListener(null);
            }
        });

        U_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[20] = true;
                checkLetter('U');
                U_button.setVisibility(View.GONE);
                U_button.setOnClickListener(null);
            }
        });

        V_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[21] = true;
                checkLetter('V');
                V_button.setVisibility(View.GONE);
                V_button.setOnClickListener(null);
            }
        });

        W_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[22] = true;
                checkLetter('W');
                W_button.setVisibility(View.GONE);
                W_button.setOnClickListener(null);
            }
        });

        X_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[23] = true;
                checkLetter('X');
                X_button.setVisibility(View.GONE);
                X_button.setOnClickListener(null);
            }
        });

        Y_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[24] = true;
                checkLetter('Y');
                Y_button.setVisibility(View.GONE);
                Y_button.setOnClickListener(null);
            }
        });

        Z_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[25] = true;
                checkLetter('Z');
                Z_button.setVisibility(View.GONE);
                Z_button.setOnClickListener(null);
            }
        });

        gameStart();
    }

    public void checkLetter(char test){

    }

    public void strike(){
        misses = misses + 1;
        updateGallows(misses);
    }

    private void getWord(ArrayList<Letter> word){

    }

    private void gameStart(){
        misses = 0;
        ArrayList<Letter> word = new ArrayList<Letter>();
        getWord(word);
    }

    private void checkWin(){

    }

    private void updateGallows(int x){
        switch(x){
            case 0:
                GallowsView.setImageResource(R.drawable.hang0);
                break;
            case 1:
                GallowsView.setImageResource(R.drawable.hang1);
                break;
            case 2:
                GallowsView.setImageResource(R.drawable.hang2);
                break;
            case 3:
                GallowsView.setImageResource(R.drawable.hang3);
                break;
            case 4:
                GallowsView.setImageResource(R.drawable.hang4);
                break;
            case 5:
                GallowsView.setImageResource(R.drawable.hang5);
                break;
            case 6:
                GallowsView.setImageResource(R.drawable.hang6);
                break;
        }
    }
}
