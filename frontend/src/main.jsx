import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./styles/index.css";
import App from "./pages/App.jsx";
import { BrowserRouter } from "react-router";
import { Routes, Route } from "react-router-dom";
import Navbar from "./components/Navbar.jsx";
import Statistics from "./pages/Statistics.jsx";

createRoot(document.getElementById("root")).render(
	<StrictMode>
		<BrowserRouter>
			<Routes>
				<Route path="/" element={<App />} />
				<Route path="/statistics" element={<Statistics />} />
			</Routes>
		</BrowserRouter>
	</StrictMode>
);
