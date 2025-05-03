import "../styles/App.css";
import Navbar from "../components/Navbar.jsx";
import React from "react";
import { useState } from "react";

function App() {
	const [data, setData] = useState(null);
	const [fileContent, setFileContent] = useState(null);

	const handleFileUpload = (event) => {
		setData(event.target.files[0]);
		if (data) {
			const reader = new FileReader();
			reader.onload = (e) => {
				const content = e.target.result;
				setFileContent(content);
				console.log(content); // Do something with the file content
			};
		}
	};

	async function sendDataToServer() {
		const formData = new FormData();
		formData.append("file", data);

		try {
			const response = await fetch("http://localhost:8080/upload", {
				method: "POST",
				body: formData,
			});
			if (response.ok) {
				const result = await response.json();
				console.log(result);
			} else {
				console.error("Error uploading file");
			}
		} catch (error) {
			console.error("Error:", error);
		}
	}

	return (
		<div className="App">
			<Navbar />
			<h1>Welcome to the E-commerce Data Analysis App</h1>
			<p>
				This app allows you to upload a CSV file containing e-commerce data and
				perform various analyses.
			</p>
			<input type="file" onChange={(e) => handleFileUpload(e)} />
			<button onClick={sendDataToServer}>Upload</button>
			{data && (
				<div>
					<h2>File Details:</h2>
					<p>Name: {data.name}</p>
					<p>Size: {data.size} bytes</p>
					<p>Type: {data.type}</p>
				</div>
			)}
		</div>
	);
}

export default App;
