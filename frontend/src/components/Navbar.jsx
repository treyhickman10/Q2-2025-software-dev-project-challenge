import React from "react";
import { Link } from "react-router-dom";
import "../styles/Navbar.css"; // Assuming you have a CSS file for styling

function Navbar() {
	return (
		<div className="navbar">
			<Link to="/">
				<button>Home</button>
			</Link>
			<Link to="/statistics">
				<button>Statistics</button>
			</Link>
		</div>
	);
}

export default Navbar;
