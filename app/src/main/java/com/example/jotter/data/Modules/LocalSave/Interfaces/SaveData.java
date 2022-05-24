package com.example.jotter.data.Modules.LocalSave.Interfaces;

public interface SaveData<T,key> {

   void Save(T data);

   void Delete(T data);

   T GetElement(key key);
}
