import React, { useState, useEffect } from 'react';

export default function Products() {
  const [products, setProducts] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    fetch('https://fakestoreapi.com/products')
      .then((res) => res.json())
      .then((data) => {
        setProducts(data);
        setLoading(false);
      });
  }, []);

  if (loading) return <p>Loading...</p>;

  return (
    <div style={{ padding: '20px', fontFamily: 'sans-serif' }}>
      <h1>Products</h1>
      <ul style={{ listStyle: 'none', padding: 0 }}>
        {products.map((product) => (
          <li
            key={product.id}
            style={{
              borderBottom: '1px solid #ccc',
              padding: '10px 0',
              display: 'flex',
              alignItems: 'center',
              gap: '15px',
            }}
          >
            <img src={product.image} alt={product.title} width="50" height="50" style={{ objectFit: 'contain' }} />
            <div>
              <strong>{product.title}</strong>
              <div>${product.price}</div>
            </div>
          </li>
        ))}
      </ul>
    </div>
  );
}