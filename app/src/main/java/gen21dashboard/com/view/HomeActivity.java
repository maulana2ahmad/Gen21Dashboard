package gen21dashboard.com.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import gen21dashboard.com.R;

public class HomeActivity extends AppCompatActivity {

    ActionBarDrawerToggle toggle;

    private DrawerLayout navDrawer;
    private NavigationView navView;

    private boolean clickback = false;

    private final int TIME = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        inisiasi();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setNaviagionSelectied();
    }

    private void setNaviagionSelectied()
    {

        toggle = new ActionBarDrawerToggle(
                HomeActivity.this, navDrawer,
                (R.string.open),
                (R.string.close)
        );

        navDrawer.addDrawerListener(toggle);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if (menuItem.getItemId() == R.id.menuSummry)
                {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.frame_drawer, new Summny4TVFragment())
                            //.addToBackStack(null)
                            .commit();
                    navDrawer.closeDrawers();
                }

                else if (menuItem.getItemId() == R.id.menuOccupacityTV)
                {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.frame_drawer, new OccupancyFragment())
                            //.addToBackStack(null)
                            .commit();
                    navDrawer.closeDrawers();
                }

                else if (menuItem.getItemId() == R.id.menuOcupacityDetile)
                {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.frame_drawer, new OcupacityDetileFragment())
                            //.addToBackStack(null)
                            .commit();
                    navDrawer.closeDrawers();
                }

                return false;
            }
        });
    }

    //back from fragment reducate
    @Override
    public void onBackPressed()
    {

        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {

            getSupportFragmentManager().popBackStackImmediate();
            return;
        }

        //tap 2x back
        if (clickback == true) {
            super.onBackPressed();
            return;
        }

        clickback = true;
        Toast.makeText(HomeActivity.this, "Press once againt to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                clickback = false;
            }
        }, TIME);
    }
    //end back from fragment reducate

    private void inisiasi() {

        navDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        navView = (NavigationView) findViewById(R.id.nav_View);

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        toggle.syncState();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        toggle.onOptionsItemSelected(item);

        return super.onOptionsItemSelected(item);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
}
