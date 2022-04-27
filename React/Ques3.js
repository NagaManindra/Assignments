import React, { Component } from 'react'
import './Ques3.css'

class Ques3 extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         name : "",
         job : "",
         person : []
      }
            
    }
    
    handlerNameChange = (event) => {
        this.setState({
            name : event.target.value
        })
        
    }
    handlerJobChange = (event) => {
        this.setState({
            job  : event.target.value
        })
    }

    handleSubmit = event => {
        var joined = this.state.person.concat({
            name : this.state.name,
            job : this.state.job
        });
        this.setState({ 
            person : joined 
        },()=>console.log(this.state.person))
        
        
        event.preventDefault()
    }
    remove=(name)=>{
        var a = name
        console.log(a)
        var index = this.state.person.indexOf(this.state.person.find(o=>o.name === name))
        console.log(name)
        this.state.person.splice(index,1)
        console.log(index)
        console.log()
        this.setState({
            person : this.state.person
        })

    }

  render() {
    return (

        <React.Fragment>
            <table>
                <tbody>
                    <tr>
                        <th>Name</th>
                        <th>Job</th>
                        <th>Remove</th>
                    </tr>
                    {this.state.person.map((person,index) =>(
                        <tr key={index}>
                            <td>{person.name}</td>
                            <td>{person.job}</td>
                            <td><button onClick={()=>this.remove(person.name)}>Delete</button></td>
                        </tr>
                    ))}
                </tbody>
            </table>
            <h4>Add New Employee</h4>
            <form >
                <label htmlFor='name'>Name:</label><br></br>
                <input type='text' id="name" onChange={this.handlerNameChange}></input><br></br>
                <label htmlFor='job'>Job:</label><br></br>
                <input type='text' id="job" onChange={this.handlerJobChange}></input><br></br>
                <button onClick={this.handleSubmit} type='submit'>Submit</button>
            </form>
        </React.Fragment>
    )
  }
}

export default Ques3