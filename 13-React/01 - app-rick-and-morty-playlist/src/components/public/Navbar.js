import React from 'react'
import Logo from "./logo.png";
import { Link } from 'react-router-dom'

const Navbar = () => {
  return (
    <header className="p-3 text-bg-dark">
      <div className="container">
        <div className="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
          <img src={Logo} className="img-fluid ${3|rounded-top,rounded-right,rounded-bottom,rounded-left,rounded-circle,|} logo" alt="" width="40px"/>
          <ul className="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
            <li><Link to="/" className="nav-link px-2">Home</Link></li>
          </ul>

          <form className="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
            <input type="search" className="form-control form-control-dark text-bg-dark" placeholder="Search..." aria-label="Search" data-twofas-input-listener="true" data-twofas-input="95d4a3eb-597b-4178-a5dc-f582aa207fd9" />
          </form>

          <div className="text-end">
            <button type="button" className="btn btn-outline-light me-2">Login</button>
            <Link to='/user-form' className="btn btn-warning">Sign-up</Link>
          </div>
        </div>
      </div>
    </header>
  )
}

export default Navbar
