package com.rosyidgrobogan.service;

import static com.rosyidgrobogan.model.TodoListModel.*;

public class TodoListService {

    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        for (int i = 0; i < dataTodo.length; i++){
            String todo = dataTodo[i];
            int no = i + 1;

            if (todo != null){
                System.out.println(no + ". "+ todo);
            }
        }

    }

    /**
     * Menambah todo List
     */
    public static void addTodoList(String todo){
        boolean isFull = true;
        // cek apakah sudah index arraynya penuh
        for (int i=0; i < dataTodo.length; i++){
            if (dataTodo[i] == null){
                // data masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // jika penuh, maka resize ukuran array 2x lipat
        if (isFull){
            // simpan data lama dulu agar tidak hilang
            String[] temporaryData = dataTodo;
            // buat array 2x lipat
            dataTodo = new String[dataTodo.length * 2];

            // insert data array lama ke dalam array baru
            for (int i = 0; i < temporaryData.length; i++){
                dataTodo[i] = temporaryData[i];
            }
        }

        // tambahkan ke posisi yang datan arraynya null
        for (int i = 0; i < dataTodo.length; i++){
            if (dataTodo[i] == null){
                dataTodo[i] = todo;
                break;
            }
        }
        /**
         * Jika index array == null, maka tambahkan data baru
         */

    }

    /**
     * Menghapus todo List
     */
    public static boolean deleteTodoList(Integer number){
        /**
         * Require: number
         */
        // TODO: cek ukuran data
        // number lebih dari ukuran array
        if ((number - 1) >= dataTodo.length){
            return false;

            // tidak ada data / null
        } else if (dataTodo[number - 1] == null){
            return false;

            // success
        }else {
           // element di index array
            // geser
            for (int i = (number - 1); i < dataTodo.length; i++){
                if (i == (dataTodo.length - 1)){
                    dataTodo[i] = null;
                }else {
                    // geser indek selanjutnya
                    dataTodo[i] = dataTodo[i + 1];
                }
            }
            return true;
        }

    }
}
