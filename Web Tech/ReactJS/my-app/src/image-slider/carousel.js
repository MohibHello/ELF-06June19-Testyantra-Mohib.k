import React, { Component } from 'react'
import Carousel from 'react-bootstrap/Carousel'


class Carouselimg extends Component {
    render() {
        return (
            <div align='center'>
                <Carousel>
                    <Carousel.Item>
                        <img
                            className="d-block w-100"
                            src="https://cdn.pixabay.com/photo/2019/07/06/03/26/yellowstone-4319675_960_720.jpg"
                            alt="First slide"
                        />
                        <Carousel.Caption>
                            <h3>First slide label</h3>
                            <p>First image </p>
                        </Carousel.Caption>
                    </Carousel.Item>
                    <Carousel.Item>
                        <img
                            className="d-block w-100"
                            src="https://cdn.pixabay.com/photo/2019/07/11/07/29/strawberries-4330211_960_720.jpg"
                            alt="Third slide"
                        />

                        <Carousel.Caption>
                            <h3>Second slide label</h3>
                            <p>Second image</p>
                        </Carousel.Caption>
                    </Carousel.Item>
                    <Carousel.Item>
                        <img
                            className="d-block w-100"
                            src="https://cdn.pixabay.com/photo/2019/07/26/10/04/city-4364408_960_720.jpg"
                            alt="Third slide"
                        />

                        <Carousel.Caption>
                            <h3>Third slide label</h3>
                            <p>third image</p>
                        </Carousel.Caption>
                    </Carousel.Item>
                </Carousel>

            </div>
        )
    }
}
export default Carouselimg