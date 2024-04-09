
export const ListNameDiv = (props) =>{
    const id = props.id;
    console.log(props);
    function fd (){
        console.log("jnafn")
        props.func(props.id);
    }
    return (
        <div >
            <button className="btn" onClick={fd}>{props.name}</button>
        </div>
    )
}