import { useEffect , useState } from "react";
export const Tasks = (props) => {
    const [httpError , sethttpError]= useState(null)
    const [tasks, setTasks] = useState([]);
    useEffect(() => {
        const fetchTasks = async () => {
        const url = `http://localhost:8080/api/get/specific/task?id=${1999}`
        const response = await fetch(url);
        if (!response.ok) {
            throw new Error("fetchTask failed:" );
        }
        const respnseData = await response.json();
        
        const loadedTask= []
        for(var i in respnseData) {
            loadedTask.push(
                {
                    id: respnseData[i]["id"],
                    task: respnseData[i]["task"],
                    completed : respnseData[i]["completed"],
                    favourite : respnseData[i]["favorite"],
                    listID : respnseData[i]["listID"],
                    listName : respnseData[i]["listName"],
                    remainderDate : respnseData[i]["remainderDate"],
                    createData : respnseData[i]["createData"]
                }
            );
        }
        setTasks(loadedTask);
    };
    fetchTasks().catch((err) => {
        sethttpError(err.message);
    })
    },[])
    return(
        <div>
            {tasks.map((task) =>{
                return(
                    <h2>{task.task}</h2>
                )
            })}
        </div>      
    );
}