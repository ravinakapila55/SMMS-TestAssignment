package com.smms_testassignment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.chipset.pieviewgroup.ChartTypes;
import com.chipset.pieviewgroup.LegendTypes;
import com.chipset.pieviewgroup.PieViewGroup;
import com.smms_testassignment.R;

import java.util.HashMap;
import java.util.Map;

public class RequisitionFragment  extends Fragment {

    PieViewGroup pieProcure;
    private final Map<String, Integer> dataSource = new HashMap<>();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View View=inflater.inflate(R.layout.custom_procurement,container,false);

        pieProcure=(PieViewGroup)View.findViewById(R.id.pieProcure);
        setData();
        return View;
    }

    public void setData()
    {
        LoadData();
        pieProcure.setData(dataSource);
        pieProcure.setChartType(ChartTypes.DONUT);
        pieProcure.setLegendMode(LegendTypes.FULL);
        pieProcure.setDonutRadiusPercent(50);
        pieProcure.build();
    }

    private void LoadData()
    {
        dataSource.put("Unsanctioned",19);
        dataSource.put("Pending",11);
        dataSource.put("upcoming",15);
    }

}
