package com.example.dev1lista1.service;

import com.example.dev1lista1.model.DiaSemanaModel;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.util.Calendar.DAY_OF_WEEK;

@Service
public class DiaSemanaService {

    public DiaSemanaModel retornaDiaSemana(Integer ano, Integer mes, Integer dia) {
        var model = new DiaSemanaModel(ano, mes, dia, null);
        model.setDescricao(calculaDiaSemana(ano, mes, dia));
        return model;
    }

    private Integer calculaDiaSemana(Integer ano, Integer mes, Integer dia) {
        try {
            var sdf = new SimpleDateFormat("dd/MM/yyyy");
            var dataString = String.format("%s/%s/%s", dia, mes, ano);
            Date data = sdf.parse(dataString);
            var gc = new GregorianCalendar();
            gc.setTime(data);
            return gc.get(DAY_OF_WEEK);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
