package com.minorproject.ckaa.travelbuddy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }
    public void call( View veiw) {
        Intent intent = new Intent(this, permits_activity.class);
        startActivity(intent);}

    public void call_connections( View veiw) {
        Intent intent = new Intent(this, Connection.class);
        startActivity(intent);}
    public void call_accomodation( View veiw) {
        Intent intent = new Intent(this, Accomodation.class);
        startActivity(intent);}
    public void call_communication( View veiw) {
        Intent intent = new Intent(this, Communication.class);
        startActivity(intent);}
    public void call_health( View veiw) {
        Intent intent = new Intent(this, HealthGuide.class);
        startActivity(intent);}
    public void call_cultural( View veiw) {
        Intent intent = new Intent(this, CulturalEttiquete.class);
        startActivity(intent);}
    public void call_ntnlmusm (View view)
    {
        Intent intent =new Intent(this,NationalMuseum.class);
        startActivity(intent);
    }
    public void call_nrynhiti (View view)
    {
        Intent intent =new Intent(this,Narayanhiti.class);
        startActivity(intent);
    }
    public void call_drbr( View veiw) {
        Intent intent = new Intent(this, Durbar_Square.class);
        startActivity(intent);}
    public void call_pashupatinath( View veiw) {
        Intent intent = new Intent(this, Pashupatinath.class);
        startActivity(intent);}
    public void call_swyambhu( View veiw) {
        Intent intent = new Intent(this, Swyambhu.class);
        startActivity(intent);}
    public void call_grdn(View view){
        Intent intent = new Intent(this,Gardendreams.class);
        startActivity(intent);
    }




       /* Intent intent = new Intent(this, TravelTipFragment.class);
        startActivity(intent);*/


    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();
    }

    public void onSectionAttached(int number) {
        Fragment fragment=null;
        Fragment googlefragment=null;
        Fragment hfragment=null;
        Fragment emergencyfragment=null;
        Fragment tafragment= null;
        Fragment eventfragment=null;
        Fragment generalfragment=null;
        switch (number) {

            case 1:
                fragment= new TravelTipFragment();
                    mTitle = getString(R.string.title_section1);
                    break;
            case 2:
                   hfragment=new Hotel();
                    mTitle = getString(R.string.title_section2);
                    break;
            case 3:
                tafragment= new TouristAttraction();
                    mTitle = getString(R.string.title_section3);
                    break;

            case 4:
                    eventfragment=new EventNewsFragment();
                    mTitle = getString(R.string.title_section5);
                    break;
            case 5:
                emergencyfragment= new EmergenyContactFragment();
                    mTitle = getString(R.string.title_section6);
                    break;
            case 6:
                    generalfragment=new general();
                    mTitle = getString(R.string.title_section7);
                    break;
            case 7:
                googlefragment=new MapFragment();
                    mTitle = getString(R.string.title_section8);
                    break;



        }
        { if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, fragment);
            fragmentTransaction.commit();}

            { if (googlefragment != null) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, googlefragment);
                fragmentTransaction.commit();
            }

                {  if (hfragment != null) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.container, hfragment);
                    fragmentTransaction.commit();}
                    {if (emergencyfragment != null) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.container, emergencyfragment);
                    fragmentTransaction.commit();}
                        { if (generalfragment != null) {
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.container, generalfragment);
                            fragmentTransaction.commit();}


                        {if (tafragment != null) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.container, tafragment);
                    fragmentTransaction.commit();}
                            { if (eventfragment != null) {
                                FragmentManager fragmentManager = getSupportFragmentManager();
                                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                                fragmentTransaction.replace(R.id.container, eventfragment);
                                fragmentTransaction.commit();}



                            }}}}}}}}

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}


