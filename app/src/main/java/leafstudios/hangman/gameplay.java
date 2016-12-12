package leafstudios.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
    private Letter[] word;
    private boolean[] usedChar;

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

        A_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[0] = true;
                checkLetter('A');
            }
        });

        B_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[1] = true;
                checkLetter('B');
            }
        });

        C_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[2] = true;
                checkLetter('C');
            }
        });

        D_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[3] = true;
                checkLetter('D');
            }
        });

        E_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[4] = true;
                checkLetter('E');
            }
        });

        F_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[5] = true;
                checkLetter('F');
            }
        });

        G_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[6] = true;
                checkLetter('G');
            }
        });

        H_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[7] = true;
                checkLetter('H');
            }
        });

        I_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[8] = true;
                checkLetter('I');
            }
        });

        J_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[9] = true;
                checkLetter('J');
            }
        });

        K_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[10] = true;
                checkLetter('K');
            }

        });

        L_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[11] = true;
                checkLetter('L');
            }
        });

        M_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[12] = true;
                checkLetter('M');
            }
        });

        N_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[13] = true;
                checkLetter('N');
            }
        });

        O_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[14] = true;
                checkLetter('O');
            }
        });

        P_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[15] = true;
                checkLetter('P');
            }
        });

        Q_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[16] = true;
                checkLetter('Q');
            }
        });

        R_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[17] = true;
                checkLetter('R');
            }
        });

        S_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[18] = true;
                checkLetter('S');
            }
        });

        T_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[19] = true;
                checkLetter('T');
            }
        });

        U_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[20] = true;
                checkLetter('U');
            }
        });

        V_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[21] = true;
                checkLetter('V');
            }
        });

        W_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[22] = true;
                checkLetter('W');
            }
        });

        X_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[23] = true;
                checkLetter('X');
            }
        });

        Y_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[24] = true;
                checkLetter('Y');
            }
        });

        Z_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usedChar[25] = true;
                checkLetter('Z');
            }
        });


    }

    public void checkLetter(char test){

    }
}
