package com.abrianus201103648.login;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CuacaRootModel
{
    @SerializedName("list")
    private List<CuacaListModel> listModelList;

    public List<CuacaListModel> getListModelList() {
        return listModelList;
    }

    public void setListModelList(List<CuacaListModel> listModelList) {
        this.listModelList = listModelList;
    }

    public CuacaRootModel() {
    }
}
