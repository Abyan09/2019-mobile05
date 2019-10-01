package polinema.activites;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import polinema.ac.id.starterchapter05.R;
import polinema.fragments.BlueFragment;
import polinema.fragments.RedFragment;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
    }

    public void handleClickLoadRedFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragment());
        fragmentTransaction.commit();
        Fragment fragment =  new Fragment(this, RedFragment.class);
        startActivity(fragment);
    }

    private void startActivity(Fragment fragment) {
    }

    public void handleClickLoadBlueFragment(View view) {
        Fragment fragment =  new Fragment(this, BlueFragment.class);
        startActivity(fragment);
    }
}
