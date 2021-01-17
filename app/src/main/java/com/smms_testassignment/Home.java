package com.smms_testassignment;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.chipset.pieviewgroup.PieViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.smms_testassignment.adapter.CrewAdapter;
import com.smms_testassignment.adapter.InventoryAdapter;
import com.smms_testassignment.adapter.JobsAdapter;
import com.smms_testassignment.adapter.MyPagerAdapter;
import com.smms_testassignment.adapter.OthersAdapter;
import com.smms_testassignment.adapter.SheqAdapter;
import com.smms_testassignment.model.CrewModel;
import com.smms_testassignment.model.InventoryModel;
import com.smms_testassignment.model.JobsModel;
import com.smms_testassignment.model.OthersModel;
import com.smms_testassignment.model.SheqModel;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Home extends AppCompatActivity {

    ArrayList<JobsModel> jobList = new ArrayList<>();
    ArrayList<InventoryModel> inventoryList = new ArrayList<>();
    ArrayList<SheqModel> sheqList = new ArrayList<>();
    ArrayList<CrewModel> crewList = new ArrayList<>();
    ArrayList<OthersModel> otherList = new ArrayList<>();
    RecyclerView recycler_jobs;
    RecyclerView recycler_inventory;
    RecyclerView recycler_sheq;
    RecyclerView recycler_crew;
    RecyclerView recycler_others;
    ViewPager pager;
    TabLayout tablayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
//        final Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/CUSTOM.TTF");

        setInit();

    }

    public void setInit()
    {
        recycler_jobs=(RecyclerView)findViewById(R.id.recycler_jobs);
        recycler_inventory=(RecyclerView)findViewById(R.id.recycler_inventory);
        recycler_sheq=(RecyclerView)findViewById(R.id.recycler_sheq);
        recycler_crew=(RecyclerView)findViewById(R.id.recycler_crew);
        recycler_others=(RecyclerView)findViewById(R.id.recycler_others);
        incident_pie = (PieViewGroup) findViewById(R.id.incident_pie);
        pager = (ViewPager) findViewById(R.id.pager);
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        setJobData();
        setInventoryData();
        setSheqData();
        setCrewData();
        setOthersData();
        setIncidentAccident();
        setProcurement();
    }


    public void setJobData()
    {
        jobList.clear();

        JobsModel jobsModel=new JobsModel("1","03","Overdue",R.drawable.red_stroke);
        jobList.add(jobsModel);

        jobsModel=new JobsModel("2","11","Due",R.drawable.orange_stroke);
        jobList.add(jobsModel);


        jobsModel=new JobsModel("3","11","In Window",R.drawable.blue_stroke);
        jobList.add(jobsModel);

        jobsModel=new JobsModel("4","09","Reminder",R.drawable.purple_stroke);
        jobList.add(jobsModel);

        jobsModel=new JobsModel("5","03","Overdue",R.drawable.red_stroke);
        jobList.add(jobsModel);

        jobsModel=new JobsModel("6","11","Due",R.drawable.orange_stroke);
        jobList.add(jobsModel);

        jobsModel=new JobsModel("7","11","In Window",R.drawable.blue_stroke);
        jobList.add(jobsModel);

        jobsModel=new JobsModel("8","09","Reminder",R.drawable.purple_stroke);
        jobList.add(jobsModel);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recycler_jobs.setLayoutManager(layoutManager);
        JobsAdapter jobsAdapter=new JobsAdapter(this,jobList);
        recycler_jobs.setAdapter(jobsAdapter);

    }


    public void setInventoryData()
    {
        inventoryList.clear();
        InventoryModel inventoryModel=new
                InventoryModel("1","06","Critical Spare parts \nbelow Min. Stock",R.drawable.cogs,R.drawable.pink_gradient);

        inventoryList.add(inventoryModel);

        inventoryModel=new
                InventoryModel("2","15","Critical Consumable \nbelow Min. Stock",R.drawable.cart,R.drawable.purple_gradient);

        inventoryList.add(inventoryModel);


        inventoryModel=new
                InventoryModel("3","12","Consumable \nTo Be Expired",R.drawable.clock,R.drawable.blue_gradient);

        inventoryList.add(inventoryModel);


        inventoryModel=new
                InventoryModel("4","03","Expired\n Consumables",R.drawable.warning,R.drawable.red_gradient);

        inventoryList.add(inventoryModel);


        LinearLayoutManager layoutManager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recycler_inventory.setLayoutManager(layoutManager);
        InventoryAdapter inventoryAdapter=new InventoryAdapter(this,inventoryList);
        recycler_inventory.setAdapter(inventoryAdapter);
    }

    public void setSheqData()
    {
        sheqList.clear();

        SheqModel sheqModel=new
                SheqModel("1","Certificates","22","7","3","15","","","");

        sheqList.add(sheqModel);

        sheqModel=new
                SheqModel("2","Survey","11","05","13","19 ","","","");

        sheqList.add(sheqModel);

        sheqModel=new
                SheqModel("3","Inspection","03","03","01","02","","","");

        sheqList.add(sheqModel);

        sheqModel=new
                SheqModel("4","Finding","","","","","01","02","15");

        sheqList.add(sheqModel);


        LinearLayoutManager layoutManager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recycler_sheq.setLayoutManager(layoutManager);
        SheqAdapter sheqAdapter=new SheqAdapter(this,sheqList);
        recycler_sheq.setAdapter(sheqAdapter);
    }

    public void setCrewData()
    {
        crewList.clear();
        CrewModel crewModel=new CrewModel("1","12","Crew \nDocument Expired",R.drawable.blue_gradient);
        crewList.add(crewModel);

        crewModel=new CrewModel("2","10","Pending \nCrew Approvals",R.drawable.light_blue_gradient);
        crewList.add(crewModel);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recycler_crew.setLayoutManager(layoutManager);
        CrewAdapter crewAdapter=new CrewAdapter(this,crewList);
        recycler_crew.setAdapter(crewAdapter);
    }

    public void setOthersData()
    {
                otherList.clear();

                OthersModel othersModel=new OthersModel("1","BUDGET","Pending for Approval","03",R.drawable.money);
                otherList.add(othersModel);

                othersModel=new OthersModel("2","VENDOR","Pending for Approval","12",R.drawable.metro_shope);
                otherList.add(othersModel);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recycler_others.setLayoutManager(layoutManager);
        OthersAdapter crewAdapter=new OthersAdapter(this,otherList);
        recycler_others.setAdapter(crewAdapter);

    }
    PieViewGroup incident_pie;
    @NonNull
    private final Map<String, Integer> dataSource = new HashMap<>();
    public void setIncidentAccident()
    {

        LoadIncidentData();
        incident_pie.setData(dataSource);
        incident_pie.showLabels(false);
        incident_pie.build();

    }

    ArrayList<Integer> colors=new ArrayList<>();

    private void LoadIncidentData()
    {
        dataSource.put("Closure",23);
        dataSource.put("Ship Follow-Up",20);
        dataSource.put("Initial Office Review",05);
        dataSource.put("Office Review",07);

    }


    public void setProcurement()
    {
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(myPagerAdapter);
        tablayout.setupWithViewPager(pager);
    }
}
