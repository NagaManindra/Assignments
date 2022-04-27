import React from 'react'
import './Ques2.css'

function Ques2() {
    const persons = [
        {
            name : "Charlie",
            job : "Jaintor"
        },
        {
            name : "Mac",
            job : "Bouncer"
        },
        {
            name : "Dee",
            job : "Aspring actress"
        },
        {
            name : "Dennis",
            job : "Bartender"
        }
    ]

    const list = persons.map(person =>(
        <tr>
            <td>{person.name}</td>
            <td>{person.job}</td>
        </tr>
        
    ))
  return (
    <div>
        <table>
            <tr>
                <th>Name</th>
                <th>Job</th>
            </tr>
            {list}
        </table>
    </div>
  )
}

export default Ques2