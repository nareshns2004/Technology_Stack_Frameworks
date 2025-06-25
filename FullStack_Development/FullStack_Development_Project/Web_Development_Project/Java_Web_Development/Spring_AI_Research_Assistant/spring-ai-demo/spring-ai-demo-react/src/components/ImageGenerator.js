import React, { useState } from "react";

function ImageGenerator() {
    const [prompt, setPrompt] = useState('');
    const [imageUrls, setImageUrls] = useState([]);

    const generateImage = async () => {
        try {
            const response = await fetch(`http://localhost:8080/generate-image?prompt=${prompt}`)
            const urls = await response.json();
            console.log(urls);
            setImageUrls(urls);
        } catch (error) {
            console.error("Error generating image : ", error)
        }
    };

    return (
        <div className="tab-content">
            <h2>Generate Image</h2>
            <input
                type="text"
                value={prompt}
                onChange={(e) => setPrompt(e.target.value)}
                placeholder="Enter prompt for image"
            />
            <button onClick={generateImage}>Generate Image</button>

            <div className="image-grid">
                {imageUrls.map((url, index) => (
                    <img key={index} src={url} alt={`Generated ${index}`} />
                ))}
                {[...Array(4 - imageUrls.length)].map((_, index) => (
                    <div key={index + imageUrls.length}
                        className="empty-image-slot"></div>
                    ))}
            </div>
        </div>
    );
}

export default ImageGenerator;