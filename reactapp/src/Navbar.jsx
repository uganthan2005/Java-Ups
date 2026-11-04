import React from 'react';
import { BrowserRouter, Routes, Route, useNavigate } from 'react-router-dom';

function Navbar() {
  const navigate = useNavigate();

  
  const handleClick = (e, path) => {
    e.preventDefault(); 
    navigate(path);     
  };

  return (
    <nav style={{ padding: '10px', background: '#eee', display: 'flex', gap: '15px' }}>
      <a href="/" onClick={(e) => handleClick(e, '/')}>Home</a>
      <a href="/about" onClick={(e) => handleClick(e, '/about')}>About (Blank)</a>
      <a href="/contact" onClick={(e) => handleClick(e, '/contact')}>Contact (Blank)</a>
    </nav>
  );
}


const Home = () => <h2>Home Page</h2>;
const BlankPage = () => null;

export default function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <div style={{ padding: '20px' }}>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<BlankPage />} />
          <Route path="/contact" element={<BlankPage />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}