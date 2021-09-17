package com.example.todolist.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface TodoDao {

    @Insert
    void insertTodo(TodoItem item);
    @Delete
    void deleteTodo(TodoItem item);//선택 delete 할 때에는 삭제할 항목을 인자로 추가해 줘야함
    @Query("delete FROM TODO")
    void deleteAllTodo();//All Delete 할 땐 삭제할 항목을 인자로 추가할 필요가 없음
    @Update
    void editTodo(TodoItem item);

}
