import { useEffect, useState } from "react";
import { ListNameDiv } from "./listnameDiv";
import { Tasks } from "./tasksPage"

export const ListTag = () => {
    const [httpError , sethttpError]= useState(null)
    const [tasklist , settasklist]  =useState([]);
    const [collectedListId , setCollectedListId] = useState(null);
    useEffect(() =>{
        const fetchTaskList = async () =>{
            const url = "http://localhost:8080/api/tasklist/get"
            const response = await fetch(url);
            if (!response.ok) {
                throw new Error("fetchTaskList failed");
            }
            const responseData = await response.json();
            const loadedTaskList = []
            for(var i in responseData) {
                loadedTaskList.push(
                    {
                        id: responseData[i]["id"],
                        listname : responseData[i]["listname"]
                    }
                );
            }

            settasklist(loadedTaskList);
        };
        fetchTaskList().catch((err) => {
            sethttpError(err.message);
        })
    },[]);
    if(httpError){
        return(
            <div>
                <p>{httpError}</p>
            </div>
        )
    }
    const displayTasks = (id) => {
      setCollectedListId(id);
    }
    return(
        <div className="ListTag">
            {tasklist.map((task) =>{
                return(  
                    <ListNameDiv func={displayTasks} id={task.id} name={task.listname} key={task.id}/>             
                )
            })}
            <section className="gf">
                <Tasks id={collectedListId} />
            </section>
        </div>
    );
}