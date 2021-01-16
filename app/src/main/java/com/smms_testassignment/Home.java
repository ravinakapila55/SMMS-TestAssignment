package com.smms_testassignment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.smms_testassignment.adapter.CrewAdapter;
import com.smms_testassignment.adapter.InventoryAdapter;
import com.smms_testassignment.adapter.JobsAdapter;
import com.smms_testassignment.adapter.SheqAdapter;
import com.smms_testassignment.model.CrewModel;
import com.smms_testassignment.model.InventoryModel;
import com.smms_testassignment.model.JobsModel;
import com.smms_testassignment.model.SheqModel;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    ArrayList<JobsModel> jobList = new ArrayList<>();
    ArrayList<InventoryModel> inventoryList = new ArrayList<>();
    ArrayList<SheqModel> sheqList = new ArrayList<>();
    ArrayList<CrewModel> crewList = new ArrayList<>();
    RecyclerView recycler_jobs;
    RecyclerView recycler_inventory;
    RecyclerView recycler_sheq;
    RecyclerView recycler_crew;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        setInit();

    }

    public void setInit()
    {
        recycler_jobs=(RecyclerView)findViewById(R.id.recycler_jobs);
        recycler_inventory=(RecyclerView)findViewById(R.id.recycler_inventory);
        recycler_sheq=(RecyclerView)findViewById(R.id.recycler_sheq);
        recycler_crew=(RecyclerView)findViewById(R.id.recycler_crew);
        setJobData();
        setInventoryData();
        setSheqData();
        setCrewData();
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
}