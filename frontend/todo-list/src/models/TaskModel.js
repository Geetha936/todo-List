class TaskModel {
    id;
    task;
    is_completed;
    create_date;
    favourite;
    list_name;
    list_id;
    remainderDate;
    constructor(id, task, is_completed,create_date,favourite,list_name,list_id,remainderDate){
        this.id = id;
        this.task = task;
        this.is_completed = is_completed;
        this.create_date = create_date;
        this.favourite = favourite;
        this.list_name = list_name;
        this.list_id = list_id;
        this.remainderDate = remainderDate;
    }

    // {
    //     "task" : "check wheather addong task is working",
    //     "createDate" : "2024-3-3",
    //     "iscompleted" : false,
    //     "remainderDate" : "2024-3-3,
    //     "favorite" : false ,
    //     "ListName" : "test",
    //     "LisfId " : "1999"
    
    // }

}