import React, { useState } from 'react'
import Logo from "./logo.png"
const Footer = () => {
    const [clicks, setClicks] = useState(0);

    const year = new Date().getFullYear();
    const companyName = "Lucas Molina";

    const handleClick = ()=>{
        setClicks(clicks +1);
    }

    return (
        <div className="container">
            <footer className="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
                <div className="col-md-4 d-flex align-items-center">
                    <span className="mb-3 mb-md-0 text-body-secondary">© {year} {companyName} // {clicks}</span>
                </div>
                 <img src={Logo} className="img-fluid ${3|rounded-top,rounded-right,rounded-bottom,rounded-left,rounded-circle,|} logo" alt="" width="40px" onClick={handleClick}/> 
                <ul className="nav col-md-4 justify-content-end list-unstyled d-flex">
                    <li className="ms-3"><a className="text-body-secondary" href="#"><svg className="bi" width="24" height="24"></svg></a></li>
                    <li className="ms-3"><a className="text-body-secondary" href="#"><svg className="bi" width="24" height="24"></svg></a></li>
                    <li className="ms-3"><a className="text-body-secondary" href="#"><svg className="bi" width="24" height="24"></svg></a></li>
                </ul>
            </footer>
        </div>
    )
}

export default Footer