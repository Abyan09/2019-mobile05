package polinema.ac.id.starterchapter05.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandstandFragment;
import polinema.ac.id.starterchapter05.fragments.PushupsFragment;

public class TugasFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_fragment);
    }

    public void handlerPushups(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        PushupsFragment pushupsFragment = (PushupsFragment) getSupportFragmentManager().findFragmentByTag("PUSHUPS_FRAGMENT");
        if(pushupsFragment != null && pushupsFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.tugasfragmentlayout, new PushupsFragment(), "PUSHUPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerDips(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        DipsFragment dipsFragment = (DipsFragment) getSupportFragmentManager().findFragmentByTag("DIPS_FRAGMENT");
        if(dipsFragment != null && dipsFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.tugasfragmentlayout, new DipsFragment(), "DIPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerHandstand(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        HandstandFragment handstandFragment = (HandstandFragment) getSupportFragmentManager().findFragmentByTag("HANDSTAND_FRAGMENT");
        if(handstandFragment != null && handstandFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.tugasfragmentlayout, new HandstandFragment(), "HANDSTAND_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
