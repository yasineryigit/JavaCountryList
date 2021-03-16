package com.ossovita.javacountrylist.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ossovita.javacountrylist.model.Country;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {
    private MutableLiveData<List<Country>> countries;


    private void refreshData() {
        Country country1 = new Country("Turkey","Asia","Ankara","TRY","Turkish","codessional.com");
        Country country2 = new Country("Italy","Europe","Roma","Euro","Italian","codessional.com");
        Country country3 = new Country("France","Europe","Paris","Euro","French","codessional.com");
        
    }

}
