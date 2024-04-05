import { useEffect, useState } from "react";
import TaskModel from "./../models/TaskModel";
export const HomePage = () =>{

    const [tasklist , settasklist]  =useState([]);
    useEffect(() => {
        const fetchTasks = async() =>{
        const url = "http://localhost:8080/api/get/task"
        const response =await fetch(url);
        if (!response.ok) {
            throw new Error(response.statusText);
        }
        const responseJSON = response.json();
        const 


    }})
    console.log(typeof(tasklist));
    return (

        <div id="homepage">
            <section>
            <h1>Tasks</h1>
            </section>
            <section id="tasklist">


            </section>
        </div>
    );
}