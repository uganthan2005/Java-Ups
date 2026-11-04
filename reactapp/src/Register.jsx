import React, { useState } from "react";

export default function Register() {
  const [formData, setFormData] = useState({
    username: "",
    email: "",
    password: "",
  });

  const [error, setError] = useState({});
  const [submitted, setSubmitted] = useState(false);

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };
  
  const handlePasswordChange = (e) => {
    setFormData({ ...formData, password: e.target.value });
  };
  
  const handleEmailChange = (e) => {
    setFormData({ ...formData, email: e.target.value });
  };

  const validate = () => {
    const newErrors = {};
    if (!formData.username) newErrors.username = "Username is required";
    if (!formData.email) newErrors.email = "Email is required";
    else if (!/\S+@\S+\.\S+/.test(formData.email)) newErrors.email = "Email is invalid";
    
    // Updated validation to check for exactly 8 characters minimum
    if (!formData.password) {
      newErrors.password = "Password is required";
    } else if (formData.password.length < 8) {
      newErrors.password = "Password must be at least 8 characters";
    }
    
    return newErrors;
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const validationErrors = validate();
    if (Object.keys(validationErrors).length > 0) {
      setError(validationErrors);
      setSubmitted(false);
    } else {
      setError({});
      setSubmitted(true);
    }
  };

  // --- DYNAMIC PASSWORD CHECK (Only tracks if length is >= 8) ---
  const currentPassword = formData.password;
  const isLengthValid = currentPassword.length >= 8;

  return (
    <div style={{ maxWidth: "400px", margin: "0 auto", padding: "20px", fontFamily: "Arial, sans-serif" }}>
      <h2>Register</h2>
      {submitted && <p style={{ color: "green" }}>Registration successful!</p>}
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: "10px" }}>
          <label htmlFor="username">Username:</label>
          <br />
          <input
            type="text"
            id="username"
            name="username"
            value={formData.username}
            onChange={handleChange}
            style={{ width: "100%", padding: "8px", boxSizing: "border-box" }}
          />
          {error.username && <p style={{ color: "red", margin: "4px 0 0" }}>{error.username}</p>}
        </div>
        
        <div style={{ marginBottom: "10px" }}>
          <label htmlFor="email">Email:</label>
          <br />
          <input
            type="email"
            id="email"
            name="email"
            value={formData.email}
            onChange={handleEmailChange}
            style={{ width: "100%", padding: "8px", boxSizing: "border-box" }}
          />
          {error.email && <p style={{ color: "red", margin: "4px 0 0" }}>{error.email}</p>}
        </div>
        
        <div style={{ marginBottom: "10px" }}>
          <label htmlFor="password">Password:</label>
          <br />
          <input
            type="password"
            id="password"
            name="password"
            value={formData.password}
            onChange={handlePasswordChange}
            style={{ width: "100%", padding: "8px", boxSizing: "border-box" }}
          />
          {error.password && <p style={{ color: "red", margin: "4px 0 0" }}>{error.password}</p>}
          
          {currentPassword.length > 0 && (
            <div style={{ marginTop: "8px", display: "flex", alignItems: "center", gap: "6px", fontSize: "12px" }}>
              <span style={{ color: isLengthValid ? "#059669" : "#6B7280" }}>
                {isLengthValid ? "Password meets the 8-character minimum" : "Must be at least 8 characters"}
              </span>
            </div>
          )}
        </div>

        <button
          type="submit"
          style={{ padding: "10px 20px", backgroundColor: "#007BFF", color: "#fff", border: "none", cursor: "pointer", width: "100%", marginTop: "10px" }}
        >
          Register
        </button>
      </form>
    </div>
  );
}
