import { Link } from "react-router-dom";
import styles from "./Navbar.module.css"

const Navbar = () => {
  return (
    <nav className={styles.Navbar}>
      <div className={styles.Tab}><Link to={"/"}>Main1</Link></div>
      <div className={styles.Tab}><Link to={"/main2"}>Main2</Link></div>
    </nav>
  );
};

export default Navbar;