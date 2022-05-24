package com.example.jotter.data.Modules.Convertation;

import java.util.List;

public interface ConvertDomeanAndDb<T1,T2> {
    T2 VariableToDomeanType(T1 param);

    T1 VariableToDbType(T2 param);

    List<T2> ArrayToDomeanType(List<T1> arrayParam);

    List<T1> ArrayToDbType(List<T2> arrayParam);
}
